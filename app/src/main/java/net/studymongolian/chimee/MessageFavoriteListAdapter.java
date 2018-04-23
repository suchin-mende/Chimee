package net.studymongolian.chimee;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MessageFavoriteListAdapter extends ArrayAdapter<Message> {

	//MongolUnicodeRenderer renderer = MongolUnicodeRenderer.INSTANCE;
	
	// View lookup cache
	private static class ViewHolder {
		TextView tvMessage;
	}

	public MessageFavoriteListAdapter(Context context, ArrayList<Message> messages) {
		super(context, R.layout.message_favorite_listview_item, messages);
		//renderer = new MongolUnicodeRenderer();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		//android.os.Debug.waitForDebugger();

		// Get the data item for this position
		Message message = getItem(position);

		// Check if an existing view is being reused, otherwise inflate the view
		ViewHolder viewHolder; // view lookup cache stored in tag
		if (convertView == null) {
			viewHolder = new ViewHolder();
			LayoutInflater inflater = LayoutInflater.from(getContext());
			convertView = inflater.inflate(R.layout.message_favorite_listview_item, parent,
					false);
			viewHolder.tvMessage = (TextView) convertView
					.findViewById(R.id.tvFavoriteListMessageItem);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}

		// Populate the data into the template view using the data object
		//viewHolder.tvMessage.setText(renderer.unicodeToGlyphs(message.getMessage()));
		
		// Return the completed view to render on screen
		return convertView;
	}
}