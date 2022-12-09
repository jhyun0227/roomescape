package project.roomescape.operator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperatorDTO {

    private Long op_id;
    private String op_loginid;
    private String op_password;
    private String op_nickname;

}
