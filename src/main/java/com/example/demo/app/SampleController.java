package com.example.demo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/sample")
public class SampleController {

    private final JdbcTemplate jdbcTemplate;

    // @Autowired DIコンテナからインスタンスを呼び出す
    // ここはコンストラクタの宣言時に、jdbcTemplateのインスタンスを呼ぶようにしている
    @Autowired
    public SampleController(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/test")
    public String test(Model model){

        String sql = "select id,name,email from inquiry where id  = 1";
        Map<String, Object> map = jdbcTemplate.queryForMap(sql); // sqlを1行実行

        model.addAttribute("title","Inquiry Form");
        model.addAttribute("name",map.get("name"));
        model.addAttribute("email",map.get("email"));
        return "test";
    }
}
