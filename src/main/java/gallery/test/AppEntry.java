package gallery.test;

/*-
 * #%L
 * actframework app demo - hello world
 * %%
 * Copyright (C) 2018 ActFramework
 * %%
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
 * #L%
 */

import act.Act;
import act.controller.Controller;
import org.osgl.$;
import org.osgl.mvc.annotation.GetAction;

import java.util.List;
import javax.validation.constraints.Min;

@SuppressWarnings("unused")
public class AppEntry extends Controller.Util {

    @GetAction("ts")
    public long timestamp() {
        return $.ms();
    }

    @GetAction("fs")
    public List<Integer> fibonacciSeries(@Min(2) int max) {
        return Util.loadFibonacciSeries(max);
    }

    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
