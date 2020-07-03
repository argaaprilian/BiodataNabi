// Generated code from Butter Knife. Do not modify!
package com.arga.biodatanabi.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.arga.biodatanabi.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view7f080024;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.mainDrawerLayout = Utils.findRequiredViewAsType(source, R.id.mainDrawer, "field 'mainDrawerLayout'", DrawerLayout.class);
    target.mainNavigationView = Utils.findRequiredViewAsType(source, R.id.mainNavigationView, "field 'mainNavigationView'", NavigationView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.mainCollapsingToolbar = Utils.findRequiredViewAsType(source, R.id.mainCollapsingToolbar, "field 'mainCollapsingToolbar'", CollapsingToolbarLayout.class);
    view = Utils.findRequiredView(source, R.id.buttonGarisKeturunan, "method 'garisKeturunan'");
    view7f080024 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.garisKeturunan();
      }
    });
    target.headerText = Utils.listFilteringNull(
        Utils.findRequiredViewAsType(source, R.id.textHeaderName, "field 'headerText'", TextView.class), 
        Utils.findRequiredViewAsType(source, R.id.textHeaderAliasName, "field 'headerText'", TextView.class));
    target.mainText = Utils.listFilteringNull(
        Utils.findRequiredViewAsType(source, R.id.textMainUsia, "field 'mainText'", TextView.class), 
        Utils.findRequiredViewAsType(source, R.id.textMainPeriode, "field 'mainText'", TextView.class));
    target.otherText = Utils.listFilteringNull(
        Utils.findRequiredViewAsType(source, R.id.textOtherTempatDiutus, "field 'otherText'", TextView.class), 
        Utils.findRequiredViewAsType(source, R.id.textOtherDisebutAlquran, "field 'otherText'", TextView.class), 
        Utils.findRequiredViewAsType(source, R.id.textOtherJumlahKeturunan, "field 'otherText'", TextView.class), 
        Utils.findRequiredViewAsType(source, R.id.textOtherSebutanKaum, "field 'otherText'", TextView.class), 
        Utils.findRequiredViewAsType(source, R.id.textOthertempatWafat, "field 'otherText'", TextView.class));
    target.rowLayout = Utils.listFilteringNull(
        Utils.findRequiredViewAsType(source, R.id.rowLayoutJumlahKeturunan, "field 'rowLayout'", LinearLayout.class), 
        Utils.findRequiredViewAsType(source, R.id.rowLayoutSebutanKaum, "field 'rowLayout'", LinearLayout.class));
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mainDrawerLayout = null;
    target.mainNavigationView = null;
    target.toolbar = null;
    target.mainCollapsingToolbar = null;
    target.headerText = null;
    target.mainText = null;
    target.otherText = null;
    target.rowLayout = null;

    view7f080024.setOnClickListener(null);
    view7f080024 = null;
  }
}
