package KOSA.spring.test.formatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.format.Formatter;

import lombok.extern.slf4j.Slf4j;

//날짜 인자를 받기 위한 format 정의  
@Slf4j
public class LocalDateFormatter implements Formatter<LocalDate> {

    @Override
    public LocalDate parse(String text, Locale locale) {
    	log.info("parse->" + text);

    	if (text.length() == 8) {
            return LocalDate.parse(text, DateTimeFormatter.ofPattern("yy-MM-dd"));
        }
        return LocalDate.parse(text, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    @Override
    public String print(LocalDate object, Locale locale) {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd").format(object);
    }
}
