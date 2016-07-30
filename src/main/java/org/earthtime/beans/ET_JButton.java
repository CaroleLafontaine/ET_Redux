/*
 * ET_JButton.java
 *
 * Created Jan 24, 2012
 *
 * Copyright 2006-2015 James F. Bowring and www.Earth-Time.org
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.earthtime.beans;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author James F. Bowring
 */
public class ET_JButton extends JButton {

    /**
     *
     */
    public ET_JButton() {
        super();
        setBackground(Color.white);
        setForeground(new java.awt.Color(255, 51, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setContentAreaFilled(false);
        setFocusPainted(false);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(110, 23));
        setSize(new java.awt.Dimension(110, 23));

        // feb 2014 for all platforms
        setFont(new Font("SanSerif", Font.PLAIN, 12));

        addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ((Component) evt.getSource()).setBackground(Color.white);
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (((Component) evt.getSource()).isEnabled()) {
                    ((Component) evt.getSource()).setBackground(new Color(225, 225, 225));
                }
            }

            @Override
            public void mousePressed(MouseEvent evt) {
                super.mousePressed(evt);
                if (((Component) evt.getSource()).isEnabled()) {
                    ((Component) evt.getSource()).setBackground(new Color(200, 200, 200));
//                    System.out.println("User clicked: " + getText());
                }
            }

            @Override
            public void mouseReleased(MouseEvent evt) {
                super.mouseReleased(evt);
                ((Component) evt.getSource()).setBackground(Color.white);
            }
        });

        setSelected(false);
    }

    /**
     *
     * @param text
     */
    public ET_JButton(String text) {
        this();
        setText(text);
        setSelected(false);
    }
}
