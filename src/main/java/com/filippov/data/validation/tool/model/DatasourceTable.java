/*
 *   Copyright 2018-2020 the original author or authors.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        https://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.filippov.data.validation.tool.model;

import java.io.Serializable;
import java.util.List;

public class DatasourceTable implements Serializable {
    private String name;
    private String primaryKey;
    private List<String> columns;

    public DatasourceTable() {
    }

    public DatasourceTable(String name, String primaryKey, List<String> columns) {
        this.name = name;
        this.primaryKey = primaryKey;
        this.columns = columns;
    }

    public static DatasourceTableBuilder builder() {
        return new DatasourceTableBuilder();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimaryKey() {
        return this.primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public List<String> getColumns() {
        return this.columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public static class DatasourceTableBuilder {
        private String name;
        private String primaryKey;
        private List<String> columns;

        DatasourceTableBuilder() {
        }

        public DatasourceTableBuilder name(String name) {
            this.name = name;
            return this;
        }

        public DatasourceTableBuilder primaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public DatasourceTableBuilder columns(List<String> columns) {
            this.columns = columns;
            return this;
        }

        public DatasourceTable build() {
            return new DatasourceTable(name, primaryKey, columns);
        }
    }
}
