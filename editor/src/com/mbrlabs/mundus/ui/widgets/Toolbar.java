/*
 * Copyright (c) 2015. See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mbrlabs.mundus.ui.widgets;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Container;
import com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup;
import com.badlogic.gdx.utils.Align;
import com.kotcrab.vis.ui.VisUI;

/**
 * @author Marcus Brummer
 * @version 24-11-2015
 */
public class Toolbar extends Container {

    private HorizontalGroup group;

    public Toolbar() {
        super();
        setBackground(VisUI.getSkin().getDrawable("default-pane"));
        align(Align.left | Align.center);
        group = new HorizontalGroup();
        setActor(group);
    }

    public void addItem(Actor actor) {
        group.addActor(actor);
    }

}