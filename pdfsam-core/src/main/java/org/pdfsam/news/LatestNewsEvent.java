/* 
 * This file is part of the PDF Split And Merge source code
 * Created on 24 ott 2015
 * Copyright 2017 by Sober Lemur S.a.s. (info@pdfsam.org).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as 
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.pdfsam.news;

import java.util.Collections;
import java.util.List;

import org.pdfsam.support.RequireUtils;

/**
 * Response to a fetch latest news request
 * 
 * @author Andrea Vacondio
 */
public class LatestNewsEvent {

    public final List<NewsData> latestNews;
    public final boolean isUpToDate;

    public LatestNewsEvent(List<NewsData> latestNews, boolean isUpToDate) {
        RequireUtils.requireNotNull(latestNews, "Latest news cannot be null");
        this.latestNews = Collections.unmodifiableList(latestNews);
        this.isUpToDate = isUpToDate;
    }
}
