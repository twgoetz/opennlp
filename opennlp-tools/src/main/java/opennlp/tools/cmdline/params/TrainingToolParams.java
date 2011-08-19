/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package opennlp.tools.cmdline.params;

import java.io.File;

import opennlp.tools.cmdline.ArgumentParser.ParameterDescription;

// TODO: remove the old BasicTrainingParameters and rename this class to BasicTrainingParameters

/**
 * Common training parameters.
 * 
 * Note: Do not use this class, internal use only!
 */
public interface TrainingToolParams extends BasicTrainingParams{
  
  @ParameterDescription(valueName = "trainData", description = "the data to be used during training")
  File getData();
  
  @ParameterDescription(valueName = "modelFile", description = "the output model file")
  File getModel();
  
}