package org.intellij.spellChecker.javadic;


import com.intellij.spellchecker.BundledDictionaryProvider;

/**
 * Java dictionary provider
 *
 * @author linux_china
 */
public class JavaDictionaryProvider implements BundledDictionaryProvider {

    public String[] getBundledDictionaries() {
        return new String[]{"java.dic"};
    }
}
