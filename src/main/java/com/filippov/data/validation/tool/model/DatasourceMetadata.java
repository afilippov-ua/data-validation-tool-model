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

import java.util.List;

public class DatasourceMetadata {
    private List<DatasourceTable> tables;
    private List<DatasourceColumn> columns;

    public DatasourceMetadata(List<DatasourceTable> tables, List<DatasourceColumn> columns) {
        this.tables = tables;
        this.columns = columns;
    }

    public DatasourceMetadata() {
    }

    public static DatasourceMetadataBuilder builder() {
        return new DatasourceMetadataBuilder();
    }

    public List<DatasourceTable> getTables() {
        return this.tables;
    }

    public List<DatasourceColumn> getColumns() {
        return this.columns;
    }

    public static class DatasourceMetadataBuilder {
        private List<DatasourceTable> tables;
        private List<DatasourceColumn> columns;

        DatasourceMetadataBuilder() {
        }

        public DatasourceMetadataBuilder tables(List<DatasourceTable> tables) {
            this.tables = tables;
            return this;
        }

        public DatasourceMetadataBuilder columns(List<DatasourceColumn> columns) {
            this.columns = columns;
            return this;
        }

        public DatasourceMetadata build() {
            return new DatasourceMetadata(tables, columns);
        }
    }
}
