package se.alipsa.bshplugin;

import com.intellij.lang.Language;

public class BeanshellLanguage extends Language {

   public static final BeanshellLanguage INSTANCE = new BeanshellLanguage();

   public BeanshellLanguage() {
      super("Beanshell");
   }
}
