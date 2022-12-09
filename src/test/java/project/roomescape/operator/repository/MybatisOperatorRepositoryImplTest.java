package project.roomescape.operator.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import project.roomescape.operator.dto.OperatorDTO;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class MybatisOperatorRepositoryImplTest {

    @Autowired
    private MybatisOperatorRepositoryImpl repository;

    @Test
    void findById() {
        Long id = 1L; //이미 DB에 생성한 계정

        Optional<OperatorDTO> findOperator = repository.findById(id);
        log.info("findOperator = {}", findOperator);

        id = 0L;
        Optional<OperatorDTO> findOperator2 = repository.findById(id);
        log.info("findOperator2 = {}", findOperator2);
    }
}