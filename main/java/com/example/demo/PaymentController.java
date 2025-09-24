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
    public List<Map<String, Object>> payments() {
        String sql = "SELECT udate, cmmcode, aispway, price, paydate FROM cmsask WHERE udate = '20250710' ORDER BY udate, cmmcode";
        return jdbc.queryForList(sql);
    }
}
