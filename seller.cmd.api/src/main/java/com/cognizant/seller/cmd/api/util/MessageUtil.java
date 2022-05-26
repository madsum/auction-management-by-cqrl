package com.cognizant.seller.cmd.api.util;


import com.cognizant.user.core.models.QueueCustomMessage;

public class MessageUtil {

    public static QueueCustomMessage makeCustomMessage(byte[] photoByte){
        QueueCustomMessage customMessage = new QueueCustomMessage();
        customMessage.setMessage("Sell it");
        customMessage.setPictureByte(photoByte);
        return customMessage;
    }
}
