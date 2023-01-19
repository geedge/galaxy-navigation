package com.galaxy.navigation.controller;

import com.galaxy.navigation.config.FileList;
import com.galaxy.navigation.config.GalaxyList;
import com.galaxy.navigation.config.PropertiesList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@CrossOrigin
@Controller
public class ComponentController {

    @Autowired
    private PropertiesList propertiesList;

    @Autowired
    private GalaxyList list;
    @Autowired
    private FileList hosts;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/component")
    @ResponseBody
    public HashMap<Object, Object> component() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("lists", list.getComponent());
        map.put("hosts", hosts.getComponent());
        map.put("arangodb", propertiesList.getArangodb());
        map.put("druid", propertiesList.getDruid());
        map.put("flink", propertiesList.getFlink());
        map.put("hadoop", propertiesList.getHadoop());
        map.put("hbase", propertiesList.getHbase());
        map.put("kafka", propertiesList.getKafka());
        map.put("nacos", propertiesList.getNacos());
        map.put("spark", propertiesList.getSpark());
        map.put("xxl_job", propertiesList.getXxl_job());
        return map;
    }


}
