/*
 * Copyright (C)  guolin, Glance Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.glance.guolindev.ui.data

import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.glance.guolindev.logic.model.Row

/**
 * This is adapter of RecyclerView to display data from a table. Using PagingDataAdapter as parent
 * to implement the paging job.
 *
 * @author guolin
 * @since 2020/9/22
 */
class DataAdapter : PagingDataAdapter<Row, DataAdapter.ViewHolder>(COMPARATOR) {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    companion object {
        private val COMPARATOR = object : DiffUtil.ItemCallback<Row>() {
            override fun areItemsTheSame(oldItem: Row, newItem: Row): Boolean =
                oldItem == newItem

            override fun areContentsTheSame(oldItem: Row, newItem: Row): Boolean =
                oldItem == newItem
        }
    }

}