package de.scheff.core.endpoint;

import com.github.shefferite.model.DictionaryResponse;
import de.scheff.core.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by User on 26/03/2017.
 */
@RestController
@RequestMapping(path = "/v1")
public class TranslationEndpoint {

    @Autowired
    private TranslationService translationService;

    @RequestMapping(path = "/translate", method = RequestMethod.POST)
    public DictionaryResponse translate(final String word) {
        return translationService.translate(word);
    }
}
