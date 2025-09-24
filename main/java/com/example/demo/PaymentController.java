package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class PaymentController {

    private final JdbcTemplate jdbc;

    public PaymentController(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @GetMapping("/payments")
    //  http://localhost:8080/payments
    public List<Payment> payments() {
        String sql = "SELECT UDATE, CMMCODE, PRICE FROM cmsask WHERE udate = '20250710' ORDER BY udate, cmmcode";
        return jdbc.query(sql, (rs, rowNum) -> 
            new Payment(
                rs.getString("UDATE"),
                rs.getString("CMMCODE"),
                rs.getInt("PRICE")
            )
        );
    }
}
