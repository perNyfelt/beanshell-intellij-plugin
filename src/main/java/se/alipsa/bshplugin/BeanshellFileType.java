package se.alipsa.bshplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.swing.*;

public class BeanshellFileType extends LanguageFileType {

   public static final BeanshellFileType INSTANCE = new BeanshellFileType();

   private BeanshellFileType() {
      super(BeanshellLanguage.INSTANCE);
   }

   @Override
   public @NotNull String getName() {
      return "Beanshell Script";
   }

   @Override
   public @NotNull @Nls(capitalization = Nls.Capitalization.Sentence) String getDescription() {
      return "Beanshell script file";
   }

   @Override
   public @NotNull String getDefaultExtension() {
      return "bsh";
   }

   @Override
   public @Nullable Icon getIcon() {
      return BeanshellIcons.FILE;
   }
}
