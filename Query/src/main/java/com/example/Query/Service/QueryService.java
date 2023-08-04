package com.example.Query.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Query.Model.Queries;
import com.example.Query.Repository.QueryRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional

public class QueryService {

    @Autowired
    QueryRepository queryRepository;

    public List<Queries> getTableDatas() {
        return queryRepository.findAllData();
    }

    public List<Queries> getDetail(Boolean activeState, List<String> descriptionList){
      return queryRepository.findData(activeState, descriptionList);
  }

  public List<Queries> getTableData() {
      return queryRepository.findAlldetail();
  }

  public int updateDatas(Boolean activeState, List<Long> idList) {
      return queryRepository.updateData(activeState, idList);
  }
}
