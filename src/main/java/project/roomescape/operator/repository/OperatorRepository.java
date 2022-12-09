package project.roomescape.operator.repository;

import project.roomescape.operator.dto.OperatorDTO;

import java.util.Optional;

public interface OperatorRepository {

    public Optional<OperatorDTO> findById(Long id);
}
