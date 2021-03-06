package ru.smartel.strike.dto.response;

import ru.smartel.strike.entity.interfaces.PostEntity;
import ru.smartel.strike.service.Locale;

/**
 * Класс-заготовка для DTO, которые содержат локализованные заголовки и содержимое
 */
public abstract class TitlesContentExtendableDTO extends TitlesExtendableDTO {

    public void setContentsOf(PostEntity entity, Locale locale) {
        setTitlesOf(entity, locale);
        if (locale == Locale.ALL) {
            add("contentRu", entity.getContentRu());
            add("contentEn", entity.getContentEn());
            add("contentEs", entity.getContentEs());
            add("contentDe", entity.getContentDe());
        } else {
            add("content", entity.getContentByLocale(locale));
        }
    }
}
