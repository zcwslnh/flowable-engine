/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.flowable.crystalball.simulator.delegate.event.impl;

import org.flowable.crystalball.simulator.SimulationEvent;
import org.flowable.crystalball.simulator.delegate.event.Function;
import org.flowable.engine.common.api.delegate.event.FlowableEvent;

/**
 * This class provides abstract base for engine event -> SimulationEvent transformation
 * 
 * @author martin.grofcik
 */
public abstract class Flowable2SimulationEventFunction implements Function<FlowableEvent, SimulationEvent> {
    protected final String simulationEventType;

    public Flowable2SimulationEventFunction(String simulationEventType) {
        this.simulationEventType = simulationEventType;
    }
}
