/*
 * Kitchen Timer
 * Copyright (C) 2015 Roberto Leinardi
 *
 * This program is free software: you can redistribute it and/or modify it under the terms
 * of the GNU General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this
 * program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.leinardi.kitchentimer.ui.dialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.webkit.WebView;

import com.leinardi.kitchentimer.R;

/**
 * Created by leinardi on 22/04/15.
 */
public class OpenSourceLicensesDialogFragment extends DialogFragment {
    private static final String LICENSES_PATH = "file:///android_asset/licenses.html";

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        WebView webView = new WebView(getActivity());
        webView.loadUrl(LICENSES_PATH);

        return new AlertDialog.Builder(getActivity(), R.style.AppCompatAlertDialogTheme)
                .setTitle(R.string.open_source_licenses)
                .setView(webView)
                .setPositiveButton(R.string.close, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dismiss();
                    }
                })
                .create();
    }
}
