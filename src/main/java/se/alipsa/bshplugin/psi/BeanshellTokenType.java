package se.alipsa.bshplugin.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import se.alipsa.bshplugin.BeanshellLanguage;

public class BeanshellTokenType extends IElementType {

   public BeanshellTokenType(@NotNull @NonNls String debugName) {
      super(debugName, BeanshellLanguage.INSTANCE);
   }

   @Override
   public String toString() {
      return "BeanshellTokenType." + super.toString();
   }
}
