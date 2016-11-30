package com.WebService.tn.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.WebService.tn.database.model.Groupes;
import com.WebService.tn.service.GroupesService;


@Controller
@RequestMapping("groupes")
public class GroupesController {
	@Autowired 
	GroupesService groupeService;
	 
	 @RequestMapping(value = "/pageT", method = RequestMethod.GET)
	    public ModelAndView getPage() {
	        ModelAndView view = new ModelAndView("groupes");
	        return view;
	    }
	 
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	    public @ResponseBody Map<String, Object> getSaved(Groupes groupes) {
	        Map<String, Object> map = new HashMap<String, Object>();
	 
	        if (groupeService.saveOrUpdate(groupes)) {
	            map.put("status", "200");
	            map.put("message", "Your record have been saved successfully");
	        }
	 
	        return map;
	    }
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> getAll(Groupes groupes) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        List<Groupes> list = groupeService.list();
 
        if (list != null) {
            map.put("status", "200");
            map.put("message", "Data found");
            map.put("data", list);
        } else {
            map.put("status", "404");
            map.put("message", "Data not found");
 
        }
 
        return map;
    }
 
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> delete(Groupes groupes) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        if (groupeService.delete(groupes)) {
            map.put("status", "200");
            map.put("message", "Your record have been deleted successfully");
        }
 
        return map;
    }
}
