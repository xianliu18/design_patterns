package com.noodles.oop.abstraction;

/**
 * @Description 抽象示例
 * @Author noodles
 * @Date 2023/10/19 17:57
 **/
public interface IPicutureStorage {
    void savePicture(String picture);
    String getPicture(String pictureId);
    void deletePicture(String pictureId);
    void modifyMetaInfo(String pictureId, String picture);
}
