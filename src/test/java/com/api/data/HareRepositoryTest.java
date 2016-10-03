package com.api.data;

import com.api.domain.Hare;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;


/**
 * Created by Porn Again Christian PRATH3 on 10/2/2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class HareRepositoryTest {

    @Autowired
    HareRepository hareRepository;

    @Test
    public void repoTest(){

        List<Hare> results = hareRepository.getByTrailNumber(1l);

        assertThat(results).isNotNull();
        assertThat(results.size()).isEqualTo(2);
    }
}
