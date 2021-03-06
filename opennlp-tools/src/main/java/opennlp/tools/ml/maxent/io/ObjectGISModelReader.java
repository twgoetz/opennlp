/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package opennlp.tools.ml.maxent.io;

import java.io.ObjectInputStream;

import opennlp.tools.ml.model.ObjectDataReader;

/**
 * @deprecated will be removed after 1.7.1 release. Don't use it.
 */
@Deprecated
public class ObjectGISModelReader extends GISModelReader {

  protected ObjectInputStream input;

  /**
   * Constructor which directly instantiates the ObjectInputStream containing
   * the model contents.
   *
   * @param ois The DataInputStream containing the model information.
   */

  public ObjectGISModelReader(ObjectInputStream ois) {
    super(new ObjectDataReader(ois));
  }
}
