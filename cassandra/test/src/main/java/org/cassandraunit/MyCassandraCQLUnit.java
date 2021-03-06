/*
 * Copyright 2016, The OpenNMS Group
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cassandraunit;

import org.cassandraunit.dataset.CQLDataSet;
import org.cassandraunit.utils.EmbeddedCassandraServerHelper;

/**
 * Used to make the after() and before() methods public.
 *
 * @author jwhite
 */
public class MyCassandraCQLUnit extends CassandraCQLUnit {
    public MyCassandraCQLUnit(CQLDataSet dataSet) {
        super(dataSet, null, EmbeddedCassandraServerHelper.DEFAULT_STARTUP_TIMEOUT* 2);
    }

    public void before() throws Exception {
        super.before();
    }

    public void after()  {
        super.after();
    }
}
