package com.glacier.basic.data.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

@Component
public class JsonDateSerializerThr extends JsonSerializer<Date> {

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    @Override
    public void serialize(Date date, JsonGenerator gen, SerializerProvider arg2) throws IOException, JsonProcessingException {
        String formattedDate = format.format(date);
        System.out.println("0000000000000"+formattedDate);
        gen.writeString(formattedDate);
    }
    
}
