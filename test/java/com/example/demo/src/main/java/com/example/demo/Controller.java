package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {

    private final JdbcTemplate jdbc;

    public Controller(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    //  http://localhost:8080/payments
    //  http://localhost:8080/payments?umonth=202508&cmmcode=C0014631
    @GetMapping("/payments")
    public List<Payment> payments(  @RequestParam(required = false) String umonth,
                                    @RequestParam(required = false) String cmmcode)  
    {
        String sql = "SELECT udate, cmmcode, aispway as payway, TO_CHAR(price) as price, TO_CHAR(payprice) as payprice, paydate FROM cmsask WHERE 1=1";
        if(umonth != null)
            sql += " AND udate like '" + umonth + "%'";
        if(cmmcode != null)
            sql += " AND cmmcode = '" + cmmcode + "'";


        return jdbc.query(sql, (rs, rowNum) -> 
            new Payment(
                rs.getString("udate"),
                rs.getString("cmmcode"),
                rs.getString("payway"),
                rs.getString("price"),
                rs.getString("payprice"),
                rs.getString("paydate")
            )
        );
    }

        // http://localhost:8080/deliveries
        // http://localhost:8080/deliveries?umonth=202508&cmmcode=C0014631
    @GetMapping("/deliveries")
    public List<Delivery> deliveries(   @RequestParam(required = false) String umonth,
                                        @RequestParam(required = false) String cmmcode) 
    {
        String sql = "SELECT udate, cmmcode, jcode, TO_CHAR(dos) AS dos FROM cydata WHERE 1=1";
        if(umonth != null)
            sql += " AND udate like '" + umonth + "%'";
        if(cmmcode != null)
            sql += " AND cmmcode ='" + cmmcode + "'";
        
        return jdbc.query(sql, (rs, rowNum) ->
            new Delivery(
                rs.getString("udate"),
                rs.getString("cmmcode"),
                rs.getString("jcode"),
                rs.getString("dos")
            )
        );
    }
    
}
