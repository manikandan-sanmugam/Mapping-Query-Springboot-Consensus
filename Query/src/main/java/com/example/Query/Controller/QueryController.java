package com.example.Query.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Query.Model.Queries;
import com.example.Query.Service.QueryService;
@RestController
@RequestMapping("/api")

public class QueryController {
    
    @Autowired
    QueryService queryService;

    @GetMapping("/show_all")
    public List<Queries> getDetails(){
        return queryService.getTableDatas();
    }
  @GetMapping("/show_data")
    public List<Queries> getDetail(){
        return queryService.getTableData();
    }
    @GetMapping("/show_data/{activeState}/{descriptionList}")
    public List<Queries> getData(@PathVariable Boolean activeState, @PathVariable List<String> descriptionList){
        return queryService.getDetail(activeState, descriptionList);
    }

    @PutMapping("/updateData/{activeState}/{idList}")
    public int updateData(@PathVariable Boolean activeState, @PathVariable List<Long> idList){
        return queryService.updateDatas(activeState, idList);
    }

}
