package com.api.data;

import com.api.domain.Hasher;
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
public class HasherRepositoryTest {

    @Autowired
    HasherRepository hasherRepository;

    @Test
    public void repoTest(){

        Hasher hasher = hasherRepository.getOne(364l);

        assertThat(hasher).isNotNull();
        assertThat(hasher.getHashName()).isEqualTo("Porn Again Christian");
        assertThat(hasher.getKennel().getName()).isEqualTo("PITTH3");
    }
}
