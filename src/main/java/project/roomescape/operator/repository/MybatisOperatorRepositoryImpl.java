package project.roomescape.operator.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.roomescape.mapper.OperatorMapper;
import project.roomescape.operator.dto.OperatorDTO;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MybatisOperatorRepositoryImpl implements OperatorRepository {

    private final OperatorMapper operatorMapper;

    @Override
    public Optional<OperatorDTO> findById(Long id) {
        return operatorMapper.findById(id);
    }
}
