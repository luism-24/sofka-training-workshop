import { Component } from '@angular/core';
import { WorkshopService } from './services/workshop.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'], 
})
export class AppComponent {
  workshop; 
  constructor(private message: WorkshopService){
    this.workshop = 'Buenas'; 
  }

  ngOnInit(){
    let obs= this.message.getWorkshopMessage(); 
    obs.subscribe((response) => this.workshop = response[0].message));
  }
}
