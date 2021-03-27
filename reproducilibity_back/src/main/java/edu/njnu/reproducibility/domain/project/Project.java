package edu.njnu.reproducibility.domain.project;

import edu.njnu.reproducibility.common.entity.BaseEntity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ：Zhiyi
 * @Date ：2020/12/4 14:44
 * @modified By：
 * @version: 1.0.0
 */

@Data
@Document(collection = "Project")
public class Project extends BaseEntity {
    @Id
    String id;
    String name;
    String description;
    String introduction;
    String purpose;
    String privacy;
    String picture;
    List<String> tags;

//    Creator creator;
    String creator;
    List<Member> members;//role: ['builder', 'rebuilder_explorer','rebuilder_operator', 'visitor']
    Integer level=0;

    Integer starCount;
    Integer watchCount;
    Integer folkCount;

    //fork detail
    Boolean isForking; //是否从别的项目Fork出来
    String forkingProject;

    Boolean isForked;
    List<String> forkedProjectList;


}
