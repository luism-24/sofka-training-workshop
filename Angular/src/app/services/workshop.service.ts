import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Workshop } from '../models/workshop';

@Injectable({
  providedIn: 'root'
})
export class WorkshopService {

  selectedWorkshop: Workshop;  
  workshops: Workshop[]; 

  constructor(private http: HttpClient) { 
    this.selectedWorkshop = new Workshop(); 
  }

  getWorkshopMessage(){
    return this.http.get('http://localhost:8080/workshop/message')
  }
}
