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

package org.flowable.http.delegate;

import java.io.Serializable;

import org.flowable.common.engine.api.variable.VariableContainer;
import org.flowable.http.HttpResponse;

/**
 * @author Tijs Rademakers
 */
@Deprecated
public interface HttpResponseHandler extends Serializable, org.flowable.http.common.api.delegate.HttpResponseHandler {

    @Override
    default void handleHttpResponse(VariableContainer execution, org.flowable.http.common.api.HttpResponse httpResponse) {
        handleHttpResponse(execution, HttpResponse.fromApiHttpResponse(httpResponse));
    }

    void handleHttpResponse(VariableContainer execution, HttpResponse httpResponse);
}
