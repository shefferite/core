package de.scheff.core.service;

import com.github.shefferite.model.DictionaryResponse;
import com.github.shefferite.model.Direction;
import com.github.shefferite.model.Language;
import com.github.shefferite.service.YDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Created by scheff on 26/03/2017.
 */
@Service
public class TranslationService {

    @Autowired
    private YDictionaryService dictionaryService;

    public DictionaryResponse translate(final String word) {
        final Direction direction = new Direction();
        direction.setSource(Language.RU);
        direction.setTarget(Language.DE);
        return dictionaryService.lookup(word, direction);
    }
}
