import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { TutorialComponent } from './tutorial/tutorial.component';
import { TopicPanelComponent } from './tutorial/topic-panel/topic-panel.component';

@NgModule({
  declarations: [
    AppComponent,
    TutorialComponent,
    TopicPanelComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }