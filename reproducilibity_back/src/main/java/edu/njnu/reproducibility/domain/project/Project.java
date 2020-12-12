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
    String purpose;
    String privacy;
    String picture;
//    List<String> tag;

    String creator;
    List<String> members;
    Integer level=0;




}
