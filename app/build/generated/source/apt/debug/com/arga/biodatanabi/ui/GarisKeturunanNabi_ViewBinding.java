// Generated code from Butter Knife. Do not modify!
package com.arga.biodatanabi.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arga.biodatanabi.R;
import com.baoyachi.stepview.VerticalStepView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GarisKeturunanNabi_ViewBinding implements Unbinder {
  private GarisKeturunanNabi target;

  @UiThread
  public GarisKeturunanNabi_ViewBinding(GarisKeturunanNabi target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.verticalStepView = Utils.findRequiredViewAsType(source, R.id.step_view, "field 'verticalStepView'", VerticalStepView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GarisKeturunanNabi target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.verticalStepView = null;
  }
}
