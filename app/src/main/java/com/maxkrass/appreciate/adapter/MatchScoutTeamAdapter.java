package com.maxkrass.appreciate.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.maxkrass.appreciate.AlphanumComparator;
import com.maxkrass.appreciate.R;
import com.maxkrass.appreciate.Team;
import com.maxkrass.appreciate.activities.MainActivity;
import com.maxkrass.appreciate.activities.ViewMatchScoutSelect;

import java.util.Collections;
import java.util.List;

public class MatchScoutTeamAdapter extends RecyclerView.Adapter<MatchScoutTeamAdapter.TeamViewHolder> {

	LayoutInflater inflater;
	List<Team> teamList = Collections.emptyList();

	public MatchScoutTeamAdapter(Context context, List<Team> teamList) {
		inflater = LayoutInflater.from(context);
		this.teamList = teamList;
	}

	@Override
	public TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = inflater.inflate(R.layout.team_row, parent, false);
		return new TeamViewHolder(view);
	}

	@Override
	public void onBindViewHolder(TeamViewHolder holder, int position) {
		holder.textView.setText("Team " + teamList.get(position).teamNumber);
	}

	public void add(Team t) {
		teamList.add(t);
		Collections.sort(teamList, new AlphanumComparator());
		notifyDataSetChanged();
	}

	@Override
	public int getItemCount() {
		return teamList.size();
	}

	class TeamViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

		TextView textView;

		public TeamViewHolder(View itemView) {
			super(itemView);
			itemView.setOnClickListener(this);
			textView = (TextView) itemView.findViewById(R.id.list_team_number);
		}

		@Override
		public void onClick(View v) {
			String name = textView.getText().toString();
			int i = name.indexOf(":");
			if (i != -1) {
				name = name.substring(0, i);
			}
			Intent intent = new Intent(MainActivity.singleton, ViewMatchScoutSelect.class);
			intent.putExtra("teamNumber", name);
			MainActivity.singleton.startActivity(intent);
		}
	}
}
