package comm.hanhan.springboot001.springbootdemo001.services;


import comm.hanhan.springboot001.springbootdemo001.dao.mapperJava01.DemoMapper;
import comm.hanhan.springboot001.springbootdemo001.dto.Demo;
import comm.hanhan.springboot001.springbootdemo001.dto.DemoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> getDemo() {
        DemoExample de=new DemoExample();
        de.createCriteria().andIdIsNotNull();
        List<Demo> demos = demoMapper.selectByExample(de);
        return demos;
    }
}
