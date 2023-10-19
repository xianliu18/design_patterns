package com.noodles.oop.abstraction.impl;

import com.noodles.oop.abstraction.IPicutureStorage;

/**
 * @Description
 * @Author noodles
 * @Date 2023/10/19 17:58
 **/
public class PictureStorage implements IPicutureStorage {
    @Override
    public void savePicture(String picture) {

    }

    @Override
    public String getPicture(String pictureId) {
        return null;
    }

    @Override
    public void deletePicture(String pictureId) {

    }

    @Override
    public void modifyMetaInfo(String pictureId, String picture) {

    }
}
