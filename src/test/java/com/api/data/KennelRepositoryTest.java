package com.api.data;

import com.api.domain.Kennel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by Porn Again Christian PRATH3 on 10/2/2016.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class KennelRepositoryTest {

    @Autowired
    KennelRepository kennelRepository;

    @Test
    public void repoTest(){

        Kennel kennel = kennelRepository.getOne(32l);

        assertThat(kennel).isNotNull();
        assertThat(kennel.getName()).isEqualTo("PITTH3");
    }

}
