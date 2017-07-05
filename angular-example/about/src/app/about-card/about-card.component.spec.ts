import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AboutCardComponent } from './about-card.component';

describe('AboutCardComponent', () => {
  let component: AboutCardComponent;
  let fixture: ComponentFixture<AboutCardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AboutCardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AboutCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
