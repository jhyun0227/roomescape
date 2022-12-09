package project.roomescape.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import project.roomescape.operator.dto.OperatorDTO;

import java.util.Optional;

@Mapper
@Component
public interface OperatorMapper {

    Optional<OperatorDTO> findById(Long id);

}
