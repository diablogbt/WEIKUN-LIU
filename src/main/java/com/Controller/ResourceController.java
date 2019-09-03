package com.Controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Entity.Resource;
import com.Service.ResourceService;


@Controller
@RequestMapping("/resources")
public class ResourceController {
	
	//inject resource service
	private ResourceService resourceService;
	
	//get the resource list from the service
	@RequestMapping("/display_resource_list")
	public List<Resource> getAllResource(){
		return resourceService.getResources();
	}
}
