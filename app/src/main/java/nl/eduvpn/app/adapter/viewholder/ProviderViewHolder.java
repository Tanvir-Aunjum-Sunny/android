/*
 *  This file is part of eduVPN.
 *
 *     eduVPN is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     eduVPN is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with eduVPN.  If not, see <http://www.gnu.org/licenses/>.
 */

package nl.eduvpn.app.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import nl.eduvpn.app.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Viewholder for the provider instance list.
 * Created by Daniel Zolnai on 2016-10-07.
 */
public class ProviderViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.providerIcon)
    public ImageView providerIcon;

    @BindView(R.id.provider_display_name)
    public TextView providerDisplayName;

    public ProviderViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
