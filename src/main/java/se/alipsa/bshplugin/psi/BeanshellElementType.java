package se.alipsa.bshplugin.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import se.alipsa.bshplugin.BeanshellLanguage;

public class BeanshellElementType extends IElementType {
   public BeanshellElementType( @NotNull @NonNls String debugName ) {
      super(debugName, BeanshellLanguage.INSTANCE);
   }
}
