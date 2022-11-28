package org.peaktime.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.peaktime.entity.SdtMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;



@SpringBootTest
class StudentMenuRepositoryTest {

    @Autowired
    SdtMenuRepository studentMenuRepository;

//    @Test
//    void createMenu() throws ParseException {
//        SdtMenu studentMenu = SdtMenu.builder()
//                .dateTime(LocalDateTime.of(2022, 10, 31, 0, 0, 0).format(DateTimeFormatter.ofPattern("MM.dd E요일")))
//                .menu("제육볶음")
//                .build();
//
//        System.out.println("studentMenu = " + studentMenu.getDate());
//    }


//    @Test
//    @Transactional
//    @DisplayName("메뉴 전체 찾기")
//    void findAllTest() {
//
//        for (int i = 0; i < 10; i++) {
//            // 메뉴 추가
//            SdtMenu studentMenu = SdtMenu.builder()
//                    .dateTime(LocalDateTime.of(2022, 11, i+1, 0, 0, 0).format(DateTimeFormatter.ofPattern("MM.dd")))
//                    .menu("제육덮밥 " + i)
//                    .build();
//
//            studentMenuRepository.save(studentMenu);
//        }
//
//        List<SdtMenu> all = studentMenuRepository.findAll();
//
//        for (SdtMenu studentMenu : all) {
//            System.out.println(studentMenu.getMenu() + " " + studentMenu.getDate());
//        }
//    }


}